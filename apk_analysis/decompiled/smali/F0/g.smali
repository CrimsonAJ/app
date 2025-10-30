.class public final LF0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls4/i;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Ls4/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LF0/g;->b:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, LF0/g;->c:I

    .line 9
    .line 10
    iput v0, p0, LF0/g;->d:I

    .line 11
    .line 12
    iput-object p1, p0, LF0/g;->a:Ls4/i;

    .line 13
    .line 14
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, LF0/g;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, LF0/g;->a:Ls4/i;

    .line 8
    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget v0, p0, LF0/g;->c:I

    .line 19
    .line 20
    iget v1, p0, LF0/g;->d:I

    .line 21
    .line 22
    iget-object v2, v2, Ls4/i;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LF0/I;

    .line 25
    .line 26
    iget-object v2, v2, LF0/S;->a:LF0/T;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v2, v0, v1, v3}, LF0/T;->d(IILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    iget v0, p0, LF0/g;->c:I

    .line 34
    .line 35
    iget v1, p0, LF0/g;->d:I

    .line 36
    .line 37
    invoke-virtual {v2, v0, v1}, Ls4/i;->Q(II)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    iget v0, p0, LF0/g;->c:I

    .line 42
    .line 43
    iget v1, p0, LF0/g;->d:I

    .line 44
    .line 45
    invoke-virtual {v2, v0, v1}, Ls4/i;->N(II)V

    .line 46
    .line 47
    .line 48
    :goto_0
    const/4 v0, 0x0

    .line 49
    iput v0, p0, LF0/g;->b:I

    .line 50
    .line 51
    return-void
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final b(II)V
    .locals 4

    .line 1
    iget v0, p0, LF0/g;->b:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, LF0/g;->c:I

    .line 7
    .line 8
    iget v2, p0, LF0/g;->d:I

    .line 9
    .line 10
    add-int/2addr v2, v0

    .line 11
    if-gt p1, v2, :cond_0

    .line 12
    .line 13
    add-int v3, p1, p2

    .line 14
    .line 15
    if-lt v3, v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, LF0/g;->c:I

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget p2, p0, LF0/g;->c:I

    .line 28
    .line 29
    sub-int/2addr p1, p2

    .line 30
    iput p1, p0, LF0/g;->d:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0}, LF0/g;->a()V

    .line 34
    .line 35
    .line 36
    iput p1, p0, LF0/g;->c:I

    .line 37
    .line 38
    iput p2, p0, LF0/g;->d:I

    .line 39
    .line 40
    iput v1, p0, LF0/g;->b:I

    .line 41
    .line 42
    return-void
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

.method public final c(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF0/g;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LF0/g;->a:Ls4/i;

    .line 5
    .line 6
    iget-object v0, v0, Ls4/i;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LF0/I;

    .line 9
    .line 10
    iget-object v0, v0, LF0/S;->a:LF0/T;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, LF0/T;->c(II)V

    .line 13
    .line 14
    .line 15
    return-void
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
