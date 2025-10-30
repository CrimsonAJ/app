.class public final Lcom/anilab/data/model/response/CommentInfoResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lo7/l;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Lcom/anilab/data/model/response/CommentResponse;

.field public final b:Lcom/anilab/data/model/response/UserResponse;


# direct methods
.method public constructor <init>(Lcom/anilab/data/model/response/CommentResponse;Lcom/anilab/data/model/response/UserResponse;)V
    .locals 0
    .param p1    # Lcom/anilab/data/model/response/CommentResponse;
        .annotation runtime Lo7/i;
            name = "comment"
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/response/UserResponse;
        .annotation runtime Lo7/i;
            name = "child_comment"
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->a:Lcom/anilab/data/model/response/CommentResponse;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->b:Lcom/anilab/data/model/response/UserResponse;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final copy(Lcom/anilab/data/model/response/CommentResponse;Lcom/anilab/data/model/response/UserResponse;)Lcom/anilab/data/model/response/CommentInfoResponse;
    .locals 1
    .param p1    # Lcom/anilab/data/model/response/CommentResponse;
        .annotation runtime Lo7/i;
            name = "comment"
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/response/UserResponse;
        .annotation runtime Lo7/i;
            name = "child_comment"
        .end annotation
    .end param

    new-instance v0, Lcom/anilab/data/model/response/CommentInfoResponse;

    invoke-direct {v0, p1, p2}, Lcom/anilab/data/model/response/CommentInfoResponse;-><init>(Lcom/anilab/data/model/response/CommentResponse;Lcom/anilab/data/model/response/UserResponse;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/anilab/data/model/response/CommentInfoResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/anilab/data/model/response/CommentInfoResponse;

    iget-object v1, p1, Lcom/anilab/data/model/response/CommentInfoResponse;->a:Lcom/anilab/data/model/response/CommentResponse;

    iget-object v3, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->a:Lcom/anilab/data/model/response/CommentResponse;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->b:Lcom/anilab/data/model/response/UserResponse;

    iget-object p1, p1, Lcom/anilab/data/model/response/CommentInfoResponse;->b:Lcom/anilab/data/model/response/UserResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->a:Lcom/anilab/data/model/response/CommentResponse;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/anilab/data/model/response/CommentResponse;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->b:Lcom/anilab/data/model/response/UserResponse;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/anilab/data/model/response/UserResponse;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CommentInfoResponse(comment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->a:Lcom/anilab/data/model/response/CommentResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/CommentInfoResponse;->b:Lcom/anilab/data/model/response/UserResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
