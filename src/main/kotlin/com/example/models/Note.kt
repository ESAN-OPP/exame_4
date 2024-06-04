package com.example.models

import com.example.responses.NoteResponse
import java.util.*

class Note(val id: UUID = UUID.randomUUID(), val title: String, val message: String, val verified: Boolean = false)

fun Note.toNoteResponse(): NoteResponse {
  return NoteResponse(id = id.toString(), title = title, message = message, verified = verified)
}
