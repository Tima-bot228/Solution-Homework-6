public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (next != null) {
            System.out.println("[JuniorSupport] Can't handle " + issue + ", escalating...");
            next.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — escalate manually.");
        }
    }
}
