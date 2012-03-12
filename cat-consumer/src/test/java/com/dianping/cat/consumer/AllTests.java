package com.dianping.cat.consumer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.dianping.cat.consumer.ip.IpReportTest;
import com.dianping.cat.consumer.transaction.NumberFormatTest;
import com.dianping.cat.consumer.transaction.TransactionReportMessageAnalyzerTest;
import com.dianping.cat.consumer.transaction.TransactionReportTest;

@RunWith(Suite.class)
@SuiteClasses({

ManyAnalyzerTest.class,

OneAnalyzerTwoDurationTest.class,

/* .ip */
IpReportTest.class,

/* .transaction */
NumberFormatTest.class,

TransactionReportMessageAnalyzerTest.class,

TransactionReportTest.class

})
public class AllTests {

}
