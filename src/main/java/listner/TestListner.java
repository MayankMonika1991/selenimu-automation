package listner;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.JiraCreateIssue;
import utility.JiraServiceProvider;


public class TestListner implements ITestListener {


    @Override

    public void onTestFailure(ITestResult result) {

        boolean islogIssue = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraCreateIssue.class).isCreateIssue();

        if (islogIssue) {

//Provide proper Jira project URL ex: https://browsertack.atlassian.net 

//Jira User name ex: browserstack@gmail.com

//API token copy from Jira dashboard ex: lorelimpusm12uijk

//Project key should be, Short name ex: BS


            JiraServiceProvider JiraServiceProvider = new JiraServiceProvider("https://jirademobymonika1991.atlassian.net/",

                    "ms.monika1991@gmail.com", "ATATT3xFfGF0G-L8GazBKfbvnZGEupq2XH3p4c_c6c8f4GFoa10Bh8RnYtF8Q8koE6mQbag_NI2jYfQI0Wf3fi3uYlGoxopVlWwJLc5w9OZ644XVVXDG2uD3QqasBaYYnyhxmChhBPOiTMhxu-lsDwFkQtP3SCTBlSMy66r8pxO3y3cdqOV5HrQ=7A90E5A1", "JIR");



            String issueDescription = "Failure Reason from Automation Testing\n\n" + result.getThrowable().getMessage()

                    + "\n";

            issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));




            String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()

                    + " Failed in Automation Testing";

            

            JiraServiceProvider.createJiraIssue("Bug", issueSummary, issueDescription, "Automated Testing");

        }

    }

    @Override

    public void onTestSkipped(ITestResult result) {

        // TODO Auto-generated method stub




    }

    @Override

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        // TODO Auto-generated method stub


    }

    @Override

    public void onStart(ITestContext context) {

        // TODO Auto-generated method stub


    }


    @Override

    public void onFinish(ITestContext context) {

        // TODO Auto-generated method stub


    }


    @Override

    public void onTestStart(ITestResult result) {

        // TODO Auto-generated method stub


    }


    @Override

    public void onTestSuccess(ITestResult result) {

        // TODO Auto-generated method stub


    }

}
