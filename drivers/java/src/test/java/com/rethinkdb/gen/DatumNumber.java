// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Test.java
package com.rethinkdb.gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static com.rethinkdb.TestingCommon.*;
import com.rethinkdb.TestingFramework;

public class DatumNumber {
    // Tests of conversion to and from the RQL number type
    Logger logger = LoggerFactory.getLogger(DatumNumber.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection conn;

    @Before
    public void setUp() throws Exception {
        logger.info("Setting up.");
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        logger.info("Tearing down.");
        r.db("rethinkdb").table("_debug_scratch").delete().run(conn);
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        conn.close(false);
    }

    // Matches Python's str() function, which we use.
    // TODO: We might want to handle this in a visit_Call in convert_tests.py instead.
    private static String str(long i) {
        return String.valueOf(i);
    }

    // A hack to concatenate two List<Long>s -- see is_array_add in convert_tests.py.
    private static List<Long> concatLong(List<Long> x, List<Long> y) {
        List<Long> ret = new ArrayList<Long>(x);
        ret.addAll(y);
        return ret;
    }

    // Autogenerated tests below

    @Test(timeout=120000)
    public void test() throws Exception {

        {
            // datum/number.yaml line #6
            /* 1 */
            Long expected_ = 1L;
            /* r.expr(1) */
            logger.info("About to run line #6: r.expr(1L)");
            Object obtained = runOrCatch(r.expr(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #6");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #15
            /* -1 */
            Long expected_ = -1L;
            /* r.expr(-1) */
            logger.info("About to run line #15: r.expr(-1L)");
            Object obtained = runOrCatch(r.expr(-1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #15");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #15:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #24
            /* 0 */
            Long expected_ = 0L;
            /* r.expr(0) */
            logger.info("About to run line #24: r.expr(0L)");
            Object obtained = runOrCatch(r.expr(0L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #24");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #24:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #35
            /* 1.0 */
            Double expected_ = 1.0;
            /* r.expr(1.0) */
            logger.info("About to run line #35: r.expr(1.0)");
            Object obtained = runOrCatch(r.expr(1.0),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #35");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #35:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #44
            /* 1.5 */
            Double expected_ = 1.5;
            /* r.expr(1.5) */
            logger.info("About to run line #44: r.expr(1.5)");
            Object obtained = runOrCatch(r.expr(1.5),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #44");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #44:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #53
            /* -0.5 */
            Double expected_ = -0.5;
            /* r.expr(-0.5) */
            logger.info("About to run line #53: r.expr(-0.5)");
            Object obtained = runOrCatch(r.expr(-0.5),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #53");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #53:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #62
            /* 67498.89278 */
            Double expected_ = 67498.89278;
            /* r.expr(67498.89278) */
            logger.info("About to run line #62: r.expr(67498.89278)");
            Object obtained = runOrCatch(r.expr(67498.89278),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #62");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #62:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #73
            /* 1234567890 */
            Long expected_ = 1234567890L;
            /* r.expr(1234567890) */
            logger.info("About to run line #73: r.expr(1234567890L)");
            Object obtained = runOrCatch(r.expr(1234567890L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #73");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #73:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #83
            /* -73850380122423 */
            Long expected_ = -73850380122423L;
            /* r.expr(-73850380122423) */
            logger.info("About to run line #83: r.expr(-73850380122423L)");
            Object obtained = runOrCatch(r.expr(-73850380122423L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #83");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #83:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #95
            /* float(1234567890123456789012345678901234567890) */
            Double expected_ = float_(1234567890123456789012345678901234567890.0);
            /* r.expr(1234567890123456789012345678901234567890) */
            logger.info("About to run line #95: r.expr(1234567890123456789012345678901234567890.0)");
            Object obtained = runOrCatch(r.expr(1234567890123456789012345678901234567890.0),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #95");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #95:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #100
            /* 123.4567890123456789012345678901234567890 */
            Double expected_ = 123.45678901234568;
            /* r.expr(123.4567890123456789012345678901234567890) */
            logger.info("About to run line #100: r.expr(123.45678901234568)");
            Object obtained = runOrCatch(r.expr(123.45678901234568),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #100");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #100:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #103
            /* 'NUMBER' */
            String expected_ = "NUMBER";
            /* r.expr(1).type_of() */
            logger.info("About to run line #103: r.expr(1L).typeOf()");
            Object obtained = runOrCatch(r.expr(1L).typeOf(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #103");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #103:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #107
            /* '1' */
            String expected_ = "1";
            /* r.expr(1).coerce_to('string') */
            logger.info("About to run line #107: r.expr(1L).coerceTo('string')");
            Object obtained = runOrCatch(r.expr(1L).coerceTo("string"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #107");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #107:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #110
            /* 1 */
            Long expected_ = 1L;
            /* r.expr(1).coerce_to('number') */
            logger.info("About to run line #110: r.expr(1L).coerceTo('number')");
            Object obtained = runOrCatch(r.expr(1L).coerceTo("number"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #110");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #110:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #115
            /* int_cmp(1) */
            IntCmp expected_ = int_cmp(1L);
            /* r.expr(1.0) */
            logger.info("About to run line #115: r.expr(1.0)");
            Object obtained = runOrCatch(r.expr(1.0),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #115");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #115:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #119
            /* int_cmp(45) */
            IntCmp expected_ = int_cmp(45L);
            /* r.expr(45) */
            logger.info("About to run line #119: r.expr(45L)");
            Object obtained = runOrCatch(r.expr(45L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #119");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #119:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/number.yaml line #123
            /* float_cmp(1.2) */
            FloatCmp expected_ = float_cmp(1.2);
            /* r.expr(1.2) */
            logger.info("About to run line #123: r.expr(1.2)");
            Object obtained = runOrCatch(r.expr(1.2),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #123");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #123:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}
