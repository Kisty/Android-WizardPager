/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.wizardpager.wizard.model;

import java.util.ArrayList;

/**
 * Represents a list of wizard pages.
 */
public class PageList<P extends Page<P>>
        extends ArrayList<P>
        implements PageTreeNode<P> {
    public PageList(P... pages) {
        for (P page : pages) {
            add(page);
        }
    }

    @Override
    public P findByKey(String key) {
        for (P childPage : this) {
            P found = childPage.findByKey(key);
            if (found != null) {
                return found;
            }
        }

        return null;
    }

    @Override
    public void flattenCurrentPageSequence(ArrayList<P> dest) {
        for (P childPage : this) {
            childPage.flattenCurrentPageSequence(dest);
        }
    }
}
