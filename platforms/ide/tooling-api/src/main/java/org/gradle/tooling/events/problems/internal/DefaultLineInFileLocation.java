/*
 * Copyright 2023 the original author or authors.
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

package org.gradle.tooling.events.problems.internal;

import org.gradle.tooling.events.problems.LineInFileLocation;

public class DefaultLineInFileLocation extends DefaultFileLocation implements LineInFileLocation {
    private final long line;
    private final long column;
    private final long length;

    public DefaultLineInFileLocation(String path, long line, long column, long length) {
        super(path);
        this.line = line;
        this.column = column;
        this.length = length;
    }

    @Override
    public long getLine() {
        return line;
    }

    @Override
    public long getColumn() {
        return column;
    }

    @Override
    public long getLength() {
        return length;
    }
}
