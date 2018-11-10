package practice.unSafeDemo;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * created by tianfeng on 2018/10/10
 */
public class UnsafeDemo {
    public static Unsafe unsafe;

    static {
        try {
            unsafe = getUnsafeInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static Unsafe getUnsafeInstance() throws IllegalAccessException, NoSuchFieldException {
        Field unsafeStaticField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeStaticField.setAccessible(true);
        return (Unsafe) unsafeStaticField.get(Unsafe.class);
    }
    public static long addressOf(Object o) throws Exception {

        Object[] array = new Object[] { o };

        long baseOffset = unsafe.arrayBaseOffset(Object[].class);
        int addressSize = unsafe.addressSize();
        long objectAddress;
        switch (addressSize) {
            case 4:
                objectAddress = unsafe.getInt(array, baseOffset);
                break;
            case 8:
                objectAddress = unsafe.getLong(array, baseOffset);
                break;
            default:
                throw new Error("unsupported address size: " + addressSize);
        }
        return (objectAddress);
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Unsafe u = getUnsafeInstance();
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int b = u.arrayBaseOffset(int[].class);
        int s = u.arrayIndexScale(int[].class);
        u.putInt(array,(long)b+s*9,1);
        System.out.println("scale:"+s);

    }
}
