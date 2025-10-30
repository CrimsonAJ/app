.class public final LL1/g;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lcom/anilab/android/ui/activity/MainActivity;


# direct methods
.method public constructor <init>(LE7/d;Lcom/anilab/android/ui/activity/MainActivity;)V
    .locals 0

    .line 1
    iput-object p2, p0, LL1/g;->s:Lcom/anilab/android/ui/activity/MainActivity;

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
    .locals 2

    .line 1
    new-instance v0, LL1/g;

    .line 2
    .line 3
    iget-object v1, p0, LL1/g;->s:Lcom/anilab/android/ui/activity/MainActivity;

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, LL1/g;-><init>(LE7/d;Lcom/anilab/android/ui/activity/MainActivity;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LL1/g;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
    check-cast p1, LM1/t;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LL1/g;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LL1/g;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LL1/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LL1/g;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LM1/t;

    .line 7
    .line 8
    invoke-virtual {p1}, LM1/t;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_5

    .line 13
    .line 14
    check-cast p1, LL1/H;

    .line 15
    .line 16
    instance-of v0, p1, LL1/G;

    .line 17
    .line 18
    iget-object v1, p0, LL1/g;->s:Lcom/anilab/android/ui/activity/MainActivity;

    .line 19
    .line 20
    const-string v2, "navController"

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p1, LL1/G;

    .line 26
    .line 27
    iget-object p1, p1, LL1/G;->a:Lcom/anilab/domain/model/LatestVersion;

    .line 28
    .line 29
    new-instance v0, LI1/o;

    .line 30
    .line 31
    invoke-direct {v0, p1}, LI1/o;-><init>(Lcom/anilab/domain/model/LatestVersion;)V

    .line 32
    .line 33
    .line 34
    sget p1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 35
    .line 36
    :try_start_0
    iget-object p1, v1, Lcom/anilab/android/ui/activity/MainActivity;->A:Lu0/H;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lu0/H;->l(Lu0/D;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :cond_1
    sget-object v0, LL1/F;->a:LL1/F;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    sget p1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 57
    .line 58
    :try_start_1
    iget-object p1, v1, Lcom/anilab/android/ui/activity/MainActivity;->A:Lu0/H;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    const v0, 0x7f0a0343

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0, v3, v3}, Lu0/H;->j(ILandroid/os/Bundle;Lu0/J;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    :cond_3
    sget-object v0, LL1/F;->b:LL1/F;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    new-instance p1, LA7/b;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :catch_0
    :cond_5
    :goto_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 89
    .line 90
    return-object p1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
