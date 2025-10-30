.class public final LG2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/VoteCommentResponse;

    .line 2
    .line 3
    const-string v0, "dto"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LH2/A;

    .line 9
    .line 10
    iget-object v2, p1, Lcom/anilab/data/model/response/VoteCommentResponse;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p1, Lcom/anilab/data/model/response/VoteCommentResponse;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-wide v4, p1, Lcom/anilab/data/model/response/VoteCommentResponse;->c:J

    .line 15
    .line 16
    iget v6, p1, Lcom/anilab/data/model/response/VoteCommentResponse;->d:I

    .line 17
    .line 18
    invoke-direct/range {v1 .. v6}, LH2/A;-><init>(Ljava/lang/String;Ljava/lang/String;JI)V

    .line 19
    .line 20
    .line 21
    return-object v1
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
.end method
