.class public final LN3/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN3/d0;


# instance fields
.field public final a:I

.field public final synthetic b:LN3/T;


# direct methods
.method public constructor <init>(LN3/T;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN3/Q;->b:LN3/T;

    .line 5
    .line 6
    iput p2, p0, LN3/Q;->a:I

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
    .locals 3

    .line 1
    iget-object v0, p0, LN3/Q;->b:LN3/T;

    .line 2
    .line 3
    iget-object v1, v0, LN3/T;->r:[LN3/c0;

    .line 4
    .line 5
    iget v2, p0, LN3/Q;->a:I

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v1}, LN3/c0;->w()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, LN3/T;->d:Le1/q;

    .line 13
    .line 14
    iget v2, v0, LN3/T;->A:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Le1/q;->f(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v0, v0, LN3/T;->j:Lk4/M;

    .line 21
    .line 22
    iget-object v2, v0, Lk4/M;->c:Ljava/io/IOException;

    .line 23
    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    iget-object v0, v0, Lk4/M;->b:Lk4/I;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const/high16 v2, -0x80000000

    .line 31
    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    iget v1, v0, Lk4/I;->a:I

    .line 35
    .line 36
    :cond_0
    iget-object v2, v0, Lk4/I;->e:Ljava/io/IOException;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget v0, v0, Lk4/I;->f:I

    .line 41
    .line 42
    if-gt v0, v1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    throw v2

    .line 46
    :cond_2
    :goto_0
    return-void

    .line 47
    :cond_3
    throw v2
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

.method public final d(LO0/c;Lm3/f;I)I
    .locals 5

    .line 1
    iget-object v0, p0, LN3/Q;->b:LN3/T;

    .line 2
    .line 3
    invoke-virtual {v0}, LN3/T;->E()Z

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
    iget v1, p0, LN3/Q;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LN3/T;->t(I)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, LN3/T;->r:[LN3/c0;

    .line 17
    .line 18
    aget-object v3, v3, v1

    .line 19
    .line 20
    iget-boolean v4, v0, LN3/T;->h0:Z

    .line 21
    .line 22
    invoke-virtual {v3, p1, p2, p3, v4}, LN3/c0;->z(LO0/c;Lm3/f;IZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-ne p1, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v1}, LN3/T;->v(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return p1
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
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
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
    .locals 3

    .line 1
    iget-object v0, p0, LN3/Q;->b:LN3/T;

    .line 2
    .line 3
    invoke-virtual {v0}, LN3/T;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, LN3/T;->r:[LN3/c0;

    .line 10
    .line 11
    iget v2, p0, LN3/Q;->a:I

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    iget-boolean v0, v0, LN3/T;->h0:Z

    .line 16
    .line 17
    invoke-virtual {v1, v0}, LN3/c0;->u(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final m(J)I
    .locals 4

    .line 1
    iget-object v0, p0, LN3/Q;->b:LN3/T;

    .line 2
    .line 3
    invoke-virtual {v0}, LN3/T;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    iget v1, p0, LN3/Q;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LN3/T;->t(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, LN3/T;->r:[LN3/c0;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    iget-boolean v3, v0, LN3/T;->h0:Z

    .line 21
    .line 22
    invoke-virtual {v2, p1, p2, v3}, LN3/c0;->s(JZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v2, p1}, LN3/c0;->F(I)V

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, LN3/T;->v(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return p1
    .line 35
    .line 36
    .line 37
    .line 38
.end method
