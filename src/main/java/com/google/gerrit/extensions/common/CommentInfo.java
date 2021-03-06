// Copyright (C) 2014 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.extensions.common;

import com.google.common.base.Objects;
import com.google.gerrit.extensions.client.Comment;

public class CommentInfo extends Comment {
  public AccountInfo author;
  public String tag;

  @Override
  public boolean equals(Object o) {
    if (super.equals(o)) {
      CommentInfo ci = (CommentInfo) o;
      return Objects.equal(author, ci.author) && Objects.equal(tag, ci.tag);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(super.hashCode(), author, tag);
  }
}
