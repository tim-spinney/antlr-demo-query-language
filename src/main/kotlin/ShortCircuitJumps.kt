/** Represents destinations for short-circuiting logical conditions.*/
data class ShortCircuitJumps(
    /**
     * The label for where to jump to if the short-circuit condition is met.
     */
    val fallthroughDestination: Int,
    /**
     * The label for the instruction after all instructions related to logical condition.
     */
    val exitDestination: Int,
    /**
     * Indicates whether to short-circuit on true or false and whether short-circuiting
     * results in true or false.
     */
    val isPositive: Boolean
)