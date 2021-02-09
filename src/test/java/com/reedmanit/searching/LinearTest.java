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
    public void testSearchPositive() {
        System.out.println("search - positive");
        Integer[] values = { 10, 25, 44, 67, 99, 200, 1, 3, 7, 9 };
        
        
        Linear instance = new Linear(values, 67);
        Integer expResult = 3;
        Integer result = instance.search();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSearchNegative() {
        System.out.println("search - positive");
        Integer[] values = { 10, 25, 44, 67, 99, 200, 1, 3, 7, 9 };
        
        
        Linear instance = new Linear(values, 2000);
        Integer expResult = -1;
        Integer result = instance.search();
        assertEquals(expResult, result);
        
    }

   
    
}
