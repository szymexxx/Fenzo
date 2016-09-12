/*
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.fenzo.queues;

/**
 * Attributes for a queue. A queue is comprised of attributes: a bucket name and a tier number. Queues are
 * placed into one or more tiers, each of which have one or more buckets. The tiers and buckets can be associated with
 * some aspects of scheduling, such as for capacity guarantees.
 */
public interface QAttributes {

    /**
     * Get the name of the queue's bucket name.
     * @return Name of the queue's bucket.
     */
    String getBucketName();

    /**
     * Tiered queues belong to a tier represented by a number. Lower numbers are ahead in the order of tiers.
     * @return The tier number for the corresponding queue.
     */
    int getTierNumber();
}
