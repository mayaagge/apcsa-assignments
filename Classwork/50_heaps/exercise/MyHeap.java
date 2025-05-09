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
                int i = pos;
                while (true) {
                    int left = leftChild(i);
                    int right = rightChild(i);
                    int target = i;
        
                    if (isMaxHeap) {
                        if (left < size && heap[left] > heap[target]) target = left;
                        if (right < size && heap[right] > heap[target]) target = right;
                    } else {
                        if (left < size && heap[left] < heap[target]) target = left;
                        if (right < size && heap[right] < heap[target]) target = right;
                    }
        
                    if (target != i) {
                        swap(i, target);
                        i = target;
                    } else {
                        break;
                    }
                }
            }

        private void heapifyUp(int pos) {
                while (pos > 0) {
                    int parentPos = parent(pos);
                    if ((isMaxHeap && heap[pos] > heap[parentPos]) ||
                        (!isMaxHeap && heap[pos] < heap[parentPos])) {
                        swap(pos, parentPos);
                        pos = parentPos;
                    } else {
                        break;
                    }
                }
            }

        public void insert(int element) {
                // YOUR CODE HERE
                if (size == maxsize){
                        throw new IllegalStateException("Max size reached for heap");
                }
                heap[size] = element;
                heapifyUp(size);
                size++;
        }

        public String toString() {
                // YOUR CODE HERE
                // Example:
                //     100
                //    20 30
               //  10 15 18 25
                String s = "";
                int count = 0;
                int level = 0;
                while (count < size) {
                    int numElements = (int) Math.pow(2, level);
                    for (int i = 0; i < numElements && count < size; i++) {
                        s += heap[count] + " ";
                        count++;
                    }
                    s += "\n";
                    level++;
                }
                return s;      
        }

        public int deleteRoot() {
            // YOUR CODE HERE
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            int root = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown(0);
            return root;
        }
        public int[] heapSort(){
            int[] tempHeap = new int[size];
            for (int i = 0; i < size; i++) {
                tempHeap[i] = heap[i];
            }
            int originalSize = size;
            int[] sorted = new int[size];
            for (int i = 0; i < sorted.length; i++) {
                sorted[i] = deleteRoot();
            }
            heap = new int[maxsize];
            for (int i = 0; i < originalSize; i++) {
                heap[i] = tempHeap[i];
            }
            size = originalSize;
            if (isMaxHeap) {
                for (int i = 0; i < sorted.length / 2; i++) {
                    int temp = sorted[i];
                    sorted[i] = sorted[sorted.length - 1 - i];
                    sorted[sorted.length - 1 - i] = temp;
                }
            }
            return sorted;
        }
}
