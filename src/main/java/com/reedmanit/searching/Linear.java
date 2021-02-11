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
 * @author Paul Reedman 
 * 
 * Example of a Linear Search
 * Generic Types are used so that function can accept any type that extends Comparable
 * 
 * Even in the average case, the algorithm's run time is
 * O(N). If you add up the number of steps required to search for every item in
 * the array, you get 1 + 2 + 3 + .... + N = N x (N + 1) / 2 If you divide that
 * total by N to get the average search time for all the N items, you get ,
 * which is still O(N).
 * 
 */
public class Linear {

    private Linear() {

    }
    

    public static <T extends Comparable<T>> Integer search(T[] array, T element) {

        
        int r = -1;    // return index negative if not found
        int count = 0;

        for (T e : array) {

            if (e.compareTo(element) == 0) { // if element matches want is in array
                r = count;  // set return value to the index counter
                break;
            }
            count++;

        }

        return r;
    }

     
}
