class MyHashSet {
    int size = 1000001;
    boolean[] hs;
    public MyHashSet() {
        hs = new boolean[size];
    }
    
    public void add(int key) {
        hs[key] = true;
    }
    
    public void remove(int key) {
        hs[key] = false;
    }
    
    public boolean contains(int key) {
        return hs[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */