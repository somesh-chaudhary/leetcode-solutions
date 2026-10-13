class MedianFinder {

    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {}
    
    public void addNum(int num) {
        if(maxheap.size()==0)maxheap.add(num);
        else{
            if(num<maxheap.peek())maxheap.add(num);
            else minheap.add(num);
        }

        if(minheap.size() > maxheap.size() + 1)maxheap.add(minheap.remove());
        if(maxheap.size() > minheap.size() + 1)minheap.add(maxheap.remove());
    }
    
    public double findMedian() {
        if(minheap.size()==maxheap.size()+1)return minheap.peek();
        if(maxheap.size()==minheap.size()+1)return maxheap.peek();
        if(maxheap.size()==minheap.size())return (maxheap.peek()+minheap.peek())/2.0;
        return 0.0;
    }
}