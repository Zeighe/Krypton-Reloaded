package gg.rsmod.game.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
data class UpdateZoneFollowsMessage(val x: Int, val z: Int, val height: Int) : Message