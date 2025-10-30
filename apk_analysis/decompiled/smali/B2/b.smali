.class public interface abstract LB2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract A(Ljava/lang/String;Lcom/anilab/data/model/request/VoteRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/VoteRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/VoteRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract B(Ljava/lang/String;Lcom/anilab/data/model/request/RegisterRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/RegisterRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/RegisterRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/LoginResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract C(Ljava/lang/String;Ljava/util/List;IILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LB8/t;
            encoded = true
            value = "genres[]"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;II",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract D(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/AllSettingsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract E(Ljava/lang/String;Lcom/anilab/data/model/request/DeleteVoteCommentRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/DeleteVoteCommentRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/h;
        hasBody = true
        method = "DELETE"
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/DeleteVoteCommentRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract F(Ljava/lang/String;Lcom/anilab/data/model/request/LogoutRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/LogoutRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/LogoutRequest;",
            "LE7/d<",
            "-",
            "Lz8/O<",
            "LA7/n;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract G(Ljava/lang/String;IILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract H(Ljava/lang/String;Lcom/anilab/data/model/request/MoviePinRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/MoviePinRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/MoviePinRequest;",
            "LE7/d<",
            "-",
            "LA7/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract I(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/AvatarListResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract J(Ljava/lang/String;ILjava/lang/String;ILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LB8/t;
            value = "keyword"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract K(Ljava/lang/String;JJLE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "start"
        .end annotation
    .end param
    .param p4    # J
        .annotation runtime LB8/t;
            value = "end"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/ScheduleResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract L(Ljava/lang/String;Ljava/lang/String;IILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LB8/t;
            value = "list_id"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract M(Ljava/lang/String;JIILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "movie_id"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JII",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/CommentListResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract N(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime LB8/t;
            value = "type"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime LB8/t;
            value = "status"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LB8/t;
            value = "order"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime LB8/t;
            value = "genres[]"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;I",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract O(Ljava/lang/String;Lcom/anilab/data/model/request/DeleteContinueWatchRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/DeleteContinueWatchRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/h;
        hasBody = true
        method = "DELETE"
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/DeleteContinueWatchRequest;",
            "LE7/d<",
            "-",
            "Lz8/O<",
            "LA7/n;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract P(Ljava/lang/String;Lcom/anilab/data/model/request/MovieIdRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/MovieIdRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/MovieIdRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract Q(Ljava/lang/String;IILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LB8/t;
            value = "page"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/ContinueWatchRowResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/HomeResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/MalIdsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Lcom/anilab/data/model/request/ReplyCommentRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/ReplyCommentRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/ReplyCommentRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/CommentResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Lcom/anilab/data/model/request/LoginRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/LoginRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/LoginRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/LoginResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;JLE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeOptional: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/EpisodeDetailResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Lcom/anilab/data/model/request/ContinueWatchRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/ContinueWatchRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/ContinueWatchRequest;",
            "LE7/d<",
            "-",
            "LA7/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;Lcom/anilab/data/model/request/SyncRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/SyncRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/SyncRequest;",
            "LE7/d<",
            "-",
            "Lz8/O<",
            "LA7/n;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LB8/t;
            value = "commentId"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/CommentInfoResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract i(Ljava/lang/String;Lcom/anilab/data/model/request/SyncRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/SyncRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/SyncRequest;",
            "LE7/d<",
            "-",
            "Lz8/O<",
            "LA7/n;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract j(Ljava/lang/String;Lcom/anilab/data/model/request/SyncMalRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/SyncMalRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/SyncMalRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/SyncMalResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract k(Ljava/lang/String;Lcom/anilab/data/model/request/LoginWithGoogleRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/LoginWithGoogleRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/LoginWithGoogleRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/LoginResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract l(Ljava/lang/String;Lcom/anilab/data/model/request/ChangePasswordRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/ChangePasswordRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/p;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/ChangePasswordRequest;",
            "LE7/d<",
            "-",
            "Lz8/O<",
            "LA7/n;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract m(Ljava/lang/String;Lcom/anilab/data/model/request/UpdateUserInfoRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/UpdateUserInfoRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/p;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/UpdateUserInfoRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/UserInfoResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract n(Ljava/lang/String;Lcom/anilab/data/model/request/DeleteCommentRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/DeleteCommentRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/h;
        hasBody = true
        method = "DELETE"
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/DeleteCommentRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract o(Ljava/lang/String;Lcom/anilab/data/model/request/CreateVoteRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/CreateVoteRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/CreateVoteRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract p(Ljava/lang/String;Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LB8/t;
            value = "parentId"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/ReplyCommentsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract q(Ljava/lang/String;JLE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "movieId"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/RelatedMovieResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract r(Ljava/lang/String;Lcom/anilab/data/model/request/CommentRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/CommentRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation runtime LB8/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/CommentRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/CommentResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract s(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/WatchListIdResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract t(Ljava/lang/String;JLE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "movie_id"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/MovieVoteResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract u(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/ListGenreResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract v(Ljava/lang/String;JLE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "movieId"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/ListEpisodeResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract w(Ljava/lang/String;ILE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LB8/t;
            value = "limit"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/PageDataResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract x(Ljava/lang/String;Lcom/anilab/data/model/request/MovieIdRequest;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/request/MovieIdRequest;
        .annotation runtime LB8/a;
        .end annotation
    .end param
    .annotation runtime LB8/h;
        hasBody = true
        method = "DELETE"
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/anilab/data/model/request/MovieIdRequest;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract y(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation runtime LB8/k;
        value = {
            "IncludeAuthorization: true"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/UserInfoResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract z(Ljava/lang/String;JLE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LB8/t;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/ApiResponse<",
            "Lcom/anilab/data/model/response/MovieResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
