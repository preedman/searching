/*
 * Copyright 2021 paul.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.reedmanit.searching;

/**
 *
 * @author paul
 */
public class BinarySearch {

    private BinarySearch() {

    }
    
    /**
     * A binary search algorithm uses a divide-and-conquer strategy to narrow down quickly the part of the array that might contain the target value. <br>
     * The algorithm keeps track of the largest and smallest indices that the target item might have in the array. <br>
     * Initially, those bounds (call them min and max) are set to 0 and the largest index in the array.<br>
     * The algorithm then calculates the index halfway between min and max (call it mid). <br>
     * If the target is less than the array's value at mid, the algorithm resets max to search the left half of the array and starts over. <br>
     * If the target is greater than the array's value at mid, the algorithm resets min to search the right half of the array and starts over. <br>
     * If the target equals the array's value at mid, the algorithm returns the index mid.<br>
     * 
     * @param <T>
     * @param array
     * @param element
     * @return index of array element. Or -1 if element is not found in array
     */

    public static <T extends Comparable<T>> Integer search(T[] array, T element) {

        Integer min = 0;
        Integer max = array.length - 1;
        Integer mid = 0;
        Boolean finished = false;

        while (min <= max) {

            mid = (min + max) / 2;

            int compare = element.compareTo(array[mid]);

            if (compare < 0) {
                max = mid - 1;
            } else {
                if (compare > 0) {
                    min = mid + 1;
                } else {
                    finished = true;
                    break;
                }

            }

        }
        if (finished) {
            return mid;
        } else {
            return -1;
        }
    } 

}
