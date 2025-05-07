public class MyHeap{
        private int[] heap;
        private int size;
        private int maxsize;
        private boolean isMaxHeap;

        public MyHeap(int numElements, boolean isMax) {
             maxsize = numElements;
             size = 0;
             heap = new int[maxsize];
             isMaxHeap = isMax;
          }

        private int parent(int pos) {
            // RETURN POSTION PARENT
            return (pos-1)/2;
        }

        private int leftChild(int pos) {
            // RETURN POSITION LEFTCHILD
            return 2*pos+1;
        }
        
        private int rightChild(int pos) {
            // RETURN POSITION RIGHTCHILD
            return 2*pos+2;
        }
        
        private void swap(int idx1, int idx2) {
                // YOUR CODE HERE
                int temp = heap[idx1];
                heap[idx1] = heap[idx2];
                heap[idx2] = temp;
        }
        

        private void heapifyDown(int pos) {
                // YOUR CODE HERE
                int i = pos;
                if (leftChild(pos)< size && heap[leftChild(pos)] < heap[i]){
                        i = leftChild(pos);
                }
                if (rightChild(pos)< size && heap[rightChild(pos)] < heap[i]){
                        i = rightChild(pos);
                }
                if (i != pos){
                        swap(pos, i);
                        heapifyDown(i);
                }
        }
        
        private void heapifyUp(int pos) {
                // YOUR CODE HERE
                while (pos > 0 && heap[pos] < heap[parent(pos)]) {
                    swap(pos, parent(pos));
                    pos = parent(pos);
                }
        }

        public void insert(int element) {
                // YOUR CODE HERE
                if (size == maxSize){
                        throw new Exception("Max size reached for heap");
                }
                heap[size] = element;
                heapify(size);
                size++;
        }

        public String toString() {
                // YOUR CODE HERE
                // Example:
                //     100
                //    20 30
               //  10 15 18 25
                for (int i = 0; i < size; i= 2*i+1){
                        for (int j = i; j < 2*i + 1; j++){
                                System.out.print(heap[j]);
                        }
                }
                        
        }

        public int deleteRoot() {
            // YOUR CODE HERE
            if (size == 0) {
                throw new Exception("Heap is empty");
            }
            int root = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown(0);
            return root;
        }

}
