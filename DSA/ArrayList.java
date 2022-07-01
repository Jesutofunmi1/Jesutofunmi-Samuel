package DSA;

public class ArrayList implements List{


    private int size;
    private int arraySize;
    private String[]  elements;

    public ArrayList(int arraySize){
        this.arraySize = arraySize;
        elements = new String[arraySize];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
//        if(size == arraySize -1) {
//            int previousSize = arraySize;
//            arraySize *= 2;
//            String[]newElements = new String[arraySize];
//            System.arraycopy(elements, 0, newElements,0, previousSize);
//            elements = newElements;
//        }
        elements[size] = item;
        size++;
    }

    @Override
    public void delete(String item) {
//        for(int i = 0; i < size; i++) {
//            if(Object.equals(item,elements[i])) {
//                System.arraycopy(elements, i + i, elements, i, size -1);
//
//            }
        for (int i = 0; i < size(); i++) {
            if(elements[i].equalsIgnoreCase(item)){
                elements[i] = null;
                size--;
                break;
            }

        }
        }


    @Override
    public int size() {
        return size;
    }
//    size --;
}
