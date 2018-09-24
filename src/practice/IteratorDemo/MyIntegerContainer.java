package practice.IteratorDemo;

import java.util.Iterator;

/**
 * created by tianfeng on 2018/6/10
 */

   public class MyIntegerContainer implements Iterable{
        private Integer[] array;
        public MyIntegerContainer(Integer[] array){
            this.array = array;
        }
        public Integer[] getDate(){
            return array;
        }

        @Override
        public Iterator iterator() {
            return new MyIterator();
        }
        private class MyIterator implements Iterator{
            int cursor;       // index of next element to return
            @Override
            public boolean hasNext() {
                if (cursor>array.length-1)return false;
                return true;
            }

            @Override
            public Integer next() {
                return array[cursor++];
            }
        }
    }

