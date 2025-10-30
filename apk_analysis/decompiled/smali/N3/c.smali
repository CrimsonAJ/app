.class public final LN3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN3/d0;


# instance fields
.field public final a:LN3/d0;

.field public b:Z

.field public final synthetic c:LN3/d;


# direct methods
.method public constructor <init>(LN3/d;LN3/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN3/c;->c:LN3/d;

    .line 5
    .line 6
    iput-object p2, p0, LN3/c;->a:LN3/d0;

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
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, LN3/c;->a:LN3/d0;

    .line 2
    .line 3
    invoke-interface {v0}, LN3/d0;->b()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public final d(LO0/c;Lm3/f;I)I
    .locals 11

    .line 1
    iget-object v0, p0, LN3/c;->c:LN3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LN3/d;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x3

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    iget-boolean v1, p0, LN3/c;->b:Z

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    const/4 v4, -0x4

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iput v3, p2, LQ0/b;->b:I

    .line 18
    .line 19
    return v4

    .line 20
    :cond_1
    iget-object v1, p0, LN3/c;->a:LN3/d0;

    .line 21
    .line 22
    invoke-interface {v1, p1, p2, p3}, LN3/d0;->d(LO0/c;Lm3/f;I)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    const/4 v1, -0x5

    .line 27
    const-wide/high16 v5, -0x8000000000000000L

    .line 28
    .line 29
    if-ne p3, v1, :cond_6

    .line 30
    .line 31
    iget-object p2, p1, LO0/c;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p2, Lj3/M;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget p3, p2, Lj3/M;->C:I

    .line 39
    .line 40
    iget v2, p2, Lj3/M;->B:I

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return v1

    .line 48
    :cond_3
    :goto_0
    iget-wide v3, v0, LN3/d;->e:J

    .line 49
    .line 50
    const-wide/16 v7, 0x0

    .line 51
    .line 52
    cmp-long v3, v3, v7

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    move v2, v4

    .line 58
    :cond_4
    iget-wide v7, v0, LN3/d;->f:J

    .line 59
    .line 60
    cmp-long v0, v7, v5

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    move p3, v4

    .line 65
    :cond_5
    invoke-virtual {p2}, Lj3/M;->a()Lj3/L;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput v2, p2, Lj3/L;->A:I

    .line 70
    .line 71
    iput p3, p2, Lj3/L;->B:I

    .line 72
    .line 73
    new-instance p3, Lj3/M;

    .line 74
    .line 75
    invoke-direct {p3, p2}, Lj3/M;-><init>(Lj3/L;)V

    .line 76
    .line 77
    .line 78
    iput-object p3, p1, LO0/c;->c:Ljava/lang/Object;

    .line 79
    .line 80
    return v1

    .line 81
    :cond_6
    iget-wide v7, v0, LN3/d;->f:J

    .line 82
    .line 83
    cmp-long p1, v7, v5

    .line 84
    .line 85
    if-eqz p1, :cond_9

    .line 86
    .line 87
    if-ne p3, v4, :cond_7

    .line 88
    .line 89
    iget-wide v9, p2, Lm3/f;->f:J

    .line 90
    .line 91
    cmp-long p1, v9, v7

    .line 92
    .line 93
    if-gez p1, :cond_8

    .line 94
    .line 95
    :cond_7
    if-ne p3, v2, :cond_9

    .line 96
    .line 97
    invoke-virtual {v0}, LN3/d;->p()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    cmp-long p1, v0, v5

    .line 102
    .line 103
    if-nez p1, :cond_9

    .line 104
    .line 105
    iget-boolean p1, p2, Lm3/f;->e:Z

    .line 106
    .line 107
    if-nez p1, :cond_9

    .line 108
    .line 109
    :cond_8
    invoke-virtual {p2}, Lm3/f;->r()V

    .line 110
    .line 111
    .line 112
    iput v3, p2, LQ0/b;->b:I

    .line 113
    .line 114
    const/4 p1, 0x1

    .line 115
    iput-boolean p1, p0, LN3/c;->b:Z

    .line 116
    .line 117
    return v4

    .line 118
    :cond_9
    return p3
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LN3/c;->c:LN3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LN3/d;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LN3/c;->a:LN3/d0;

    .line 10
    .line 11
    invoke-interface {v0}, LN3/d0;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
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
.end method

.method public final m(J)I
    .locals 1

    .line 1
    iget-object v0, p0, LN3/c;->c:LN3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LN3/d;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x3

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object v0, p0, LN3/c;->a:LN3/d0;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, LN3/d0;->m(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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
