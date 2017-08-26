package Domain.Model.User.Listener;

import Domain.Common.EventInterface;
import Domain.Common.EventListenerInterface;

final public class SendWelcomeEmailListener implements EventListenerInterface
{
    @Override
    public void handle(EventInterface event)
    {
        System.out.println("Send an e-mail");
    }
}
