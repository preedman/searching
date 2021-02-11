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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paul
 */
public class LinearTest {
    
    public LinearTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    
    @Test
    public void testSearchGenericFoundInteger() {
        System.out.println("Search - Generic - Found Integer");
        
        Integer[] values = { 10, 25, 44, 67, 99, 200, 1, 3, 7, 9 };
        
              
        Integer expResult = 8;
        Integer result = Linear.search(values, 7);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSearchGenericFoundString() {
        System.out.println("Search - Generic - Found String ");
        
        String[] values = { "apples", "pears", "oranges", "grapes", "lemons", "banannas", "apricots", "avocados" };
        
              
        Integer expResult = 3;
        Integer result = Linear.search(values, "grapes");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSearchGenericNotFoundString() {
        System.out.println("Search - Generic - Not Found String ");
        
        String[] values = { "apples", "pears", "oranges", "grapes", "lemons", "banannas", "apricots", "avocados" };
        
              
        Integer expResult = -1;
        Integer result = Linear.search(values, "drink");
        assertEquals(expResult, result);
    }

   
    
}
