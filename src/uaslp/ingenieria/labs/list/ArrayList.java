package uaslp.ingenieria.labs.list;

public class ArrayList <H> implements List<H>{

    private Object array[];
    private int size;

    public ArrayList() {
        this.array = new Object[10];
    }

    @Override
    public void add(H data) {
        this.array[size++] = data;
    }

    @Override
    public H get(int index) {
        return (H)this.array[index];
    }

    @Override
    public void delete(int index) {
        if(index==0){
            for(int i=0; i<size; i++){
                array[i]= array[i+1];
            }
            size--;
        }
        if(index==size){
            size--;
        }
        if(index >0 && index <size){
            for(int i=0; i<size; i++){
                if(index <= i) {
                    array[i] = array[i + 1];
                }
            }
            size--;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    public Iterator<H> getIterator(){
        return null;
    }
    public Iterator<H> getReverseIterator(){
        return null;
    }


}
