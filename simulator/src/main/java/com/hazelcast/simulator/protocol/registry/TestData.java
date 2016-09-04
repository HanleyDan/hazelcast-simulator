/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hazelcast.simulator.protocol.registry;

import com.hazelcast.simulator.common.TestCase;
import com.hazelcast.simulator.coordinator.TestSuite;
import com.hazelcast.simulator.protocol.core.SimulatorAddress;

public class TestData {

    private final int testIndex;
    private final SimulatorAddress address;
    private final TestCase testCase;
    private final TestSuite testSuite;
    private volatile long startTimeMillis;

    TestData(int testIndex, SimulatorAddress address, TestCase testCase, TestSuite testSuite) {
        this.testIndex = testIndex;
        this.address = address;
        this.testCase = testCase;
        this.testSuite = testSuite;
    }

    public int getTestIndex() {
        return testIndex;
    }

    public SimulatorAddress getAddress() {
        return address;
    }

    public TestCase getTestCase() {
        return testCase;
    }

    public TestSuite getTestSuite() {
        return testSuite;
    }

    public void initStartTime() {
        this.startTimeMillis = System.currentTimeMillis();
    }

    public long getStartTimeMillis() {
        return startTimeMillis;
    }
}
