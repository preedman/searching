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
public class MajorityVotingTest {

    public MajorityVotingTest() {
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
    public void testSearchClear() {
        System.out.println("search string colours - clear majority");
        String[] array = {"green", "red", "blue", "yellow", "red", "white", "black", "black", "black"};
        Object expResult = "black";
        Object result = MajorityVoting.search(array);
       // assertEquals(expResult, result);
        System.out.println(result.toString());
        System.out.println(MajorityVoting.counter);

    }

    @Test
    public void testSearchNone() {
        System.out.println("search string colours - no majority");
        String[] array = {"green", "red", "green", "red", "white", "white", "black", "blue"};

        Object result = MajorityVoting.search(array);

        
        System.out.println(result.toString());
        System.out.println(MajorityVoting.counter);
     //   assertEquals(1, MajorityVoting.counter);

    }
}
