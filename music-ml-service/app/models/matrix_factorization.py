class MatrixFactorizationModel:
    def __init__(num_users: int, num_items: int, embedding_dim: int)
    def forward(user_ids: list, item_ids: list)
    def predict(user_id: str, candidate_ids: list)
    def get_top_k(user_id: str, k: int)

class BPRLoss:
    def forward(positive_scores: list, negative_scores: list)