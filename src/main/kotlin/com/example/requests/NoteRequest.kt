package com.example.requests

import com.example.models.Note
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
class NoteRequest(
    val title: String,
    val message: String,
    val verified: Boolean
)

fun NoteRequest.toNote(
    id: UUID = UUID.randomUUID()
): Note {
    return Note(
        id = id,
        title = title,
        message = message,
        verified = verified
    )
}