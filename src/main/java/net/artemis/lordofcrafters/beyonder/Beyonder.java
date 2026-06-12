package net.artemis.lordofcrafters.beyonder;

public class Beyonder {
    public String SEQUENCE_NAME;
    // TODO LIST:
    // Create the base system for the player to become a beyonder.
    // Presumably, the beyonder system would have the base beyonder class, which all of the different pathway classes would extends from
    // this way, the beyonder class can store all of the possible functions needed, and they can be called in all of the different classes without having to worry about
    // calling functions from specific pathways. It creates a much more structured approach to the system
    // So presumably, {Pathway Name} extends Beyonder.

    // Then, I have to take into account the Sequences.
    // Each pathway has their own unique abilities, which will of course be able to be called under their general 'Ability X' function.
    // The problem is, I have to account for the expanding abilities, and the upgrades to the abilities.
    // For the expanding abilities, I've thought of a system where a player is able to select a certain amount of abilities they can use at a time
    // Like, there's 5 Ability slots and players can choose from their ability list to select which ability goes where.
    // My current thought is having each ability actually be a seperate class, so I can call on them, which is possible if I use the same delegation system I use for Powerful Auras and this mod.
    // the other problem is the fact that the abilities strengthen after each sequence. I could make individual classes for each ability at each tier, but I feel like that isn't efficient
    // I guess having the ability rely on variables for their 'stats' and then those stats increase at each sequence

    // Another problem is specific abilities, like Divination
    // Its incredibly complicated, with a nigh endless number of edge cases, especially due to the various beyonder abilities and circumstances that can cause interference
    // I'm sure I can create general cases for things like trying to divine a beyonder that's of a higher sequence than you, but how would I account for cases that give false information?
    // Perhaps like a 'Pinging' system, where if you try to divine about someone of a higher sequence, if they have compatible abilities that allow for divination interference, then they essentially get a notification that says they tried to divine you and then you can interfere in different ways

    // As for the 'Stats' of a different class, like the different boosts that a class gives, I can just have a huge list of stats in this class.
    // That way, I can also just have a singular Codec for all of the beyonder classes instead of having to make individual codecs, which I actually dont think would work anyways



}
