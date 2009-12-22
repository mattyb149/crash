import org.crsh.shell.ScriptException;
import org.crsh.console.ConsoleBuilder;
import org.kohsuke.args4j.Argument;

public class checkout extends org.crsh.shell.ClassCommand {

  @Argument(required=false,index=0,usage="The path of the node to checkout")
  def String path;

  public Object execute() throws ScriptException {
    assertConnected();
    def node = findNodeByPath(path);
    node.checkout();
  }
}