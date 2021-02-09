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
 * Even in the average case, the algorithm's run time is O(N). 
 * If you add up the number of steps required to search for every item in the array, you get 1 + 2 + 3 + .... + N = N x (N + 1) / 2 
 * If you divide that total by N to get the average search time for all the N items, you get , which is still O(N).
 */
public class Linear {
    
    private Integer[] values;
    private Integer target;
    
    public Linear(Integer[] theValues, Integer theTarget) {
        
        values = theValues;
        target = theTarget;
        
    }
    
    // Find the target item's index in the sorted array.
    // If the item isn't in the array, return -1.
    
    public Integer search() {
        
        int stop = values.length - 1;
        int r = -1;
        
        for(int i = 0; i < stop; i++ ) {
            if (values[i] == target) {
                r = i;
                break;
            }
            
            
        }
        return r;
    }

    /**
     * @return the values
     */
    public Integer[] getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(Integer[] values) {
        this.values = values;
    }

    /**
     * @return the target
     */
    public Integer getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(Integer target) {
        this.target = target;
    }
    
    
    
    
    
}
