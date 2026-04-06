class PredictRequest:
    user_id: str
    current_track_id: str
    mood_vector: dict

class PredictResponse:
    next_track_id: str
    score: float