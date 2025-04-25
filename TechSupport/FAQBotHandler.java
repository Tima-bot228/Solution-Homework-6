public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (next != null) {
            System.out.println("[FAQBot] Can't handle " + issue + ", escalating...");
            next.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — escalate manually.");
        }
    }
}
