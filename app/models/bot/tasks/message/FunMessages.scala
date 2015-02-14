package models.bot.tasks.message

/**
 * A list of fun, pre-defined message trees.
 */
object FunMessages {

  def messages = List(
    MessageTree(
      value = "{name} are you a fan of avocados?",
      right = Some(MessageTree(
        value = "So if I asked you to have a guacamole party with me you'd do it?",
        right = None,
        left = None
      )),
      left = Some(MessageTree(
        value = "Do women love anything more than avocados?",
        right = None,
        left = None
      ))
    ),
    MessageTree(
      value = "Can you teach a guy to bake and all that?",
      right = Some(MessageTree(
        value = "How about peach crumble in a crock pot?",
        right = None,
        left = None
      )),
      left = None
    ),
    MessageTree(
      value = "{name} do you like The Little Mermaid?",
      right = Some(MessageTree(
        value = "Do you know the scene in Kiss the Girl where they're floating in a blue lagoon?",
        right = Some(MessageTree(
          value = "I found it. The lagoon. It's right here in DC!,
          right = None,
          left = None
          )),
      left = Some(MessageTree(
        value = "Oh... I thought everyone liked that movie?",
        right = None,
        left = None
      ))
    ),
    
    )
  )

}
