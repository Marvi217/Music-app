class MoodUpdateRequest:
    user_id: str
    event_type: str
    track_energy: float
    track_valence: float
    current_mood: dict

class MoodUpdateResponse:
    energy: float
    stability: float
    novelty: float
    mood_state: str