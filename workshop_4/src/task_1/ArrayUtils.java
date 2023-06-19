package task_1;

public class ArrayUtils {
    /**
     *
     * @param array
     * @param index1
     * @param index2
     * @param <T>
     */
    public static <T> T[] replaceTwoElements(T[] array, int index1, int index2) {
        if(index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length)
            throw new IndexOutOfBoundsException();
        T[] bufferArray = array.clone();
        T buffer = bufferArray[index1];
        bufferArray[index1] = bufferArray[index2];
        bufferArray[index2] = buffer;
        return bufferArray;
    }
}
