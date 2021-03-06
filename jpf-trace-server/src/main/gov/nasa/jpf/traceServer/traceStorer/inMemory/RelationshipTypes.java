//
// Copyright (C) 2010 Igor Andjelkovic (igor.andjelkovic@gmail.com).
// All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.traceServer.traceStorer.inMemory;

/**
 * Relationships used in the <code>inMemory</code> graph database, used by
 * {@link InMemoryTraceStorer}.
 * 
 * @author Igor Andjelkovic
 * 
 */
public enum RelationshipTypes {

  /**
   * Root of the graph.
   */
  ROOT_STATE,

  /**
   * Connects the events that represent JPF states.
   */
  TRANSITION,

  /**
   * Connects the events from the same transition.
   */
  EVENT,

  /**
   * Last event in the transition. Makes it easy to find the end of the
   * transition.
   */
  LAST_EVENT,

  /**
   * Last "new" state that was generated by JPF. It is important for fetching
   * the last path from the trace.
   */
  LAST_STATE,

  /**
   * Connects root state and the "end" states. It is important for fetching the
   * paths that are ended.
   */
  END_STATE
}
