package com.mahmoud.guesscraft.repository

import com.mahmoud.guesscraft.data.remote.ws.Room
import com.mahmoud.guesscraft.util.Resource

interface SetupRepository {

    suspend fun createRoom(room: Room): Resource<Unit>

    suspend fun getRooms(searchQuery: String): Resource<List<Room>>

    suspend fun joinRoom(username: String, roomName: String): Resource<Unit>
}