.class public final Lg2/y;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public r:I

.field public s:I

.field public final synthetic t:Lcom/anilab/android/ui/player/PlayerActivity;


# direct methods
.method public constructor <init>(LE7/d;Lcom/anilab/android/ui/player/PlayerActivity;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lg2/y;->t:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 1

    .line 1
    new-instance p1, Lg2/y;

    .line 2
    .line 3
    iget-object v0, p0, Lg2/y;->t:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2, v0}, Lg2/y;-><init>(LE7/d;Lcom/anilab/android/ui/player/PlayerActivity;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lg2/y;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lg2/y;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lg2/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, LF7/a;->a:LF7/a;

    .line 17
    .line 18
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lg2/y;->s:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lg2/y;->r:I

    .line 12
    .line 13
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    move v1, v2

    .line 29
    :cond_3
    sget p1, LX7/a;->d:I

    .line 30
    .line 31
    sget-object p1, LX7/c;->d:LX7/c;

    .line 32
    .line 33
    invoke-static {v3, p1}, LZ0/a;->A(ILX7/c;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    iput v1, p0, Lg2/y;->r:I

    .line 38
    .line 39
    iput v3, p0, Lg2/y;->s:I

    .line 40
    .line 41
    invoke-static {v4, v5}, LY7/B;->z(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    invoke-static {v4, v5, p0}, LY7/B;->g(JLE7/d;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    sget-object p1, LA7/n;->a:LA7/n;

    .line 53
    .line 54
    :goto_1
    if-ne p1, v0, :cond_5

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_5
    :goto_2
    add-int/2addr v1, v3

    .line 58
    iget-object p1, p0, Lg2/y;->t:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 59
    .line 60
    iget-boolean v4, p1, Lcom/anilab/android/ui/player/PlayerActivity;->Z:Z

    .line 61
    .line 62
    if-eqz v4, :cond_6

    .line 63
    .line 64
    invoke-virtual {p1, v2}, Lcom/anilab/android/ui/player/PlayerActivity;->p0(Z)V

    .line 65
    .line 66
    .line 67
    :cond_6
    rem-int/lit8 v4, v1, 0x1e

    .line 68
    .line 69
    if-nez v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/anilab/android/ui/player/PlayerActivity;->Z()Lj3/r0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, LD/n;

    .line 76
    .line 77
    invoke-virtual {v1}, LD/n;->d0()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-virtual {p1, v3}, Lcom/anilab/android/ui/player/PlayerActivity;->V(Z)V

    .line 84
    .line 85
    .line 86
    goto :goto_0
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
