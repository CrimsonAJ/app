.class public final LG2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/AvatarResponse;

    .line 2
    .line 3
    const-string v0, "dto"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LH2/a;

    .line 9
    .line 10
    iget-object v0, p1, Lcom/anilab/data/model/response/AvatarResponse;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "{width}x{height}"

    .line 13
    .line 14
    const-string v3, "150x150"

    .line 15
    .line 16
    invoke-static {v0, v2, v3}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget-object v5, p1, Lcom/anilab/data/model/response/AvatarResponse;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget v6, p1, Lcom/anilab/data/model/response/AvatarResponse;->d:I

    .line 23
    .line 24
    iget-wide v2, p1, Lcom/anilab/data/model/response/AvatarResponse;->a:J

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, LH2/a;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    return-object v1
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
