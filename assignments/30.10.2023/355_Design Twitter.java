class Twitter {
    
    HashMap<Integer, User> users;
    int timestamp;
    public Twitter() {

        users = new HashMap();
        timestamp = 0;
    }
    
    public void postTweet(int userId, int tweetId) {

        users.putIfAbsent(userId, new User(userId));
        users.get(userId).addTweet(tweetId, timestamp++);
    }
    public List<Integer> getNewsFeed(int userId) {

        users.putIfAbsent(userId, new User(userId));
        PriorityQueue<Tweet> minHeap = new PriorityQueue<Tweet>((a, b) -> (a.timestamp - b.timestamp));
        addTweetsInMinHeap(minHeap, users.get(userId).tweets);

        for(int followee : users.get(userId).followees){
            addTweetsInMinHeap(minHeap, users.get(followee).tweets);
        }
        
        List<Integer> tweetIdList = new ArrayList();

        while(!minHeap.isEmpty()){
            tweetIdList.add(minHeap.remove().tweetId);
        }
        Collections.reverse(tweetIdList);
        return tweetIdList;
    }
    
    private void addTweetsInMinHeap(PriorityQueue<Tweet> minHeap, LinkedList<Tweet> tweets){

        for(Tweet tweet : tweets){
            minHeap.add(tweet);
            
            if(minHeap.size() > 10){
                minHeap.remove();
            }
        }
    }

    public void follow(int followerId, int followeeId) {

        users.putIfAbsent(followerId, new User(followerId));
        users.putIfAbsent(followeeId, new User(followeeId));
        users.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(!users.containsKey(followerId)) return;
        
        users.get(followerId).unfollow(followeeId);
    }
}

class User {
  
    HashSet<Integer> followees;
    LinkedList<Tweet> tweets;
    int userId;
    
    public User(int userId){
        this.userId = userId;
        followees = new HashSet();
        tweets = new LinkedList();
    }
    
    public void follow(int followeeId){

        followees.add(followeeId);
    }
    
    public void unfollow(int followeeId){

        followees.remove(followeeId);
    }
    
    public void addTweet(int tweetId, int timestamp){

        tweets.addLast(new Tweet(tweetId, timestamp));
        

        if(tweets.size() > 10) tweets.removeFirst();
    }
    
}

class Tweet{
    int tweetId;
    int timestamp;
    
    public Tweet(int tweetId, int timestamp){
        this.tweetId = tweetId;
        this.timestamp = timestamp;
    }
}