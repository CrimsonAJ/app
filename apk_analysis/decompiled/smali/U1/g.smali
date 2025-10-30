.class public final LU1/g;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lcom/anilab/android/ui/filter/FilterFragment;


# direct methods
.method public constructor <init>(Lcom/anilab/android/ui/filter/FilterFragment;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU1/g;->s:Lcom/anilab/android/ui/filter/FilterFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

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
    new-instance v0, LU1/g;

    .line 2
    .line 3
    iget-object v1, p0, LU1/g;->s:Lcom/anilab/android/ui/filter/FilterFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LU1/g;-><init>(Lcom/anilab/android/ui/filter/FilterFragment;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LU1/g;->r:Ljava/lang/Object;

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
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU1/g;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU1/g;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU1/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object p1, p0, LU1/g;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LY7/z;

    .line 7
    .line 8
    new-instance v0, LU1/c;

    .line 9
    .line 10
    iget-object v1, p0, LU1/g;->s:Lcom/anilab/android/ui/filter/FilterFragment;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, LU1/c;-><init>(Lcom/anilab/android/ui/filter/FilterFragment;LE7/d;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    invoke-static {p1, v2, v0, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 18
    .line 19
    .line 20
    new-instance v0, LU1/d;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, LU1/d;-><init>(Lcom/anilab/android/ui/filter/FilterFragment;LE7/d;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v2, v0, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 26
    .line 27
    .line 28
    new-instance v0, LU1/e;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, LU1/e;-><init>(Lcom/anilab/android/ui/filter/FilterFragment;LE7/d;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v2, v0, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 34
    .line 35
    .line 36
    new-instance v0, LU1/f;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, LU1/f;-><init>(Lcom/anilab/android/ui/filter/FilterFragment;LE7/d;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v2, v0, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 42
    .line 43
    .line 44
    sget-object p1, LA7/n;->a:LA7/n;

    .line 45
    .line 46
    return-object p1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
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
