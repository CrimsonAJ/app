.class public final Lz3/c;
.super Lz3/i;
.source "SourceFile"


# instance fields
.field public n:Lq3/n;

.field public o:LN3/X;


# virtual methods
.method public final b(LA4/r;)J
    .locals 4

    .line 1
    iget-object v0, p1, LA4/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget-byte v2, v0, v1

    .line 7
    .line 8
    const/4 v3, -0x1

    .line 9
    if-ne v2, v3, :cond_2

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    aget-byte v0, v0, v2

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    shr-int/2addr v0, v2

    .line 18
    const/4 v3, 0x6

    .line 19
    if-eq v0, v3, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x7

    .line 22
    if-ne v0, v3, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1, v2}, LA4/r;->I(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, LA4/r;->D()J

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/D1;->G(ILA4/r;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1, v1}, LA4/r;->H(I)V

    .line 35
    .line 36
    .line 37
    int-to-long v0, v0

    .line 38
    return-wide v0

    .line 39
    :cond_2
    const-wide/16 v0, -0x1

    .line 40
    .line 41
    return-wide v0
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
.end method

.method public final c(LA4/r;JLk4/E;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v1, LA4/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [B

    .line 10
    .line 11
    iget-object v4, v0, Lz3/c;->n:Lq3/n;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    new-instance v4, Lq3/n;

    .line 17
    .line 18
    const/16 v6, 0x11

    .line 19
    .line 20
    invoke-direct {v4, v6, v3}, Lq3/n;-><init>(I[B)V

    .line 21
    .line 22
    .line 23
    iput-object v4, v0, Lz3/c;->n:Lq3/n;

    .line 24
    .line 25
    iget v1, v1, LA4/r;->b:I

    .line 26
    .line 27
    const/16 v6, 0x9

    .line 28
    .line 29
    invoke-static {v3, v6, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v4, v1, v3}, Lq3/n;->c([BLD3/c;)Lj3/M;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, v2, Lk4/E;->b:Ljava/lang/Object;

    .line 39
    .line 40
    return v5

    .line 41
    :cond_0
    const/4 v6, 0x0

    .line 42
    aget-byte v3, v3, v6

    .line 43
    .line 44
    and-int/lit8 v7, v3, 0x7f

    .line 45
    .line 46
    const/4 v8, 0x3

    .line 47
    if-ne v7, v8, :cond_1

    .line 48
    .line 49
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/Y1;->A(LA4/r;)Lk4/E;

    .line 50
    .line 51
    .line 52
    move-result-object v19

    .line 53
    new-instance v9, Lq3/n;

    .line 54
    .line 55
    iget-wide v1, v4, Lq3/n;->j:J

    .line 56
    .line 57
    iget-object v3, v4, Lq3/n;->l:LD3/c;

    .line 58
    .line 59
    iget v10, v4, Lq3/n;->a:I

    .line 60
    .line 61
    iget v11, v4, Lq3/n;->b:I

    .line 62
    .line 63
    iget v12, v4, Lq3/n;->c:I

    .line 64
    .line 65
    iget v13, v4, Lq3/n;->d:I

    .line 66
    .line 67
    iget v14, v4, Lq3/n;->e:I

    .line 68
    .line 69
    iget v15, v4, Lq3/n;->g:I

    .line 70
    .line 71
    iget v4, v4, Lq3/n;->h:I

    .line 72
    .line 73
    move-wide/from16 v17, v1

    .line 74
    .line 75
    move-object/from16 v20, v3

    .line 76
    .line 77
    move/from16 v16, v4

    .line 78
    .line 79
    invoke-direct/range {v9 .. v20}, Lq3/n;-><init>(IIIIIIIJLk4/E;LD3/c;)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v1, v19

    .line 83
    .line 84
    iput-object v9, v0, Lz3/c;->n:Lq3/n;

    .line 85
    .line 86
    new-instance v2, LN3/X;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v9, v2, LN3/X;->c:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v1, v2, LN3/X;->d:Ljava/lang/Object;

    .line 94
    .line 95
    const-wide/16 v3, -0x1

    .line 96
    .line 97
    iput-wide v3, v2, LN3/X;->a:J

    .line 98
    .line 99
    iput-wide v3, v2, LN3/X;->b:J

    .line 100
    .line 101
    iput-object v2, v0, Lz3/c;->o:LN3/X;

    .line 102
    .line 103
    return v5

    .line 104
    :cond_1
    const/4 v1, -0x1

    .line 105
    if-ne v3, v1, :cond_3

    .line 106
    .line 107
    iget-object v1, v0, Lz3/c;->o:LN3/X;

    .line 108
    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    move-wide/from16 v3, p2

    .line 112
    .line 113
    iput-wide v3, v1, LN3/X;->a:J

    .line 114
    .line 115
    iput-object v1, v2, Lk4/E;->c:Ljava/lang/Object;

    .line 116
    .line 117
    :cond_2
    iget-object v1, v2, Lk4/E;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lj3/M;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    return v6

    .line 125
    :cond_3
    return v5
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

.method public final d(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lz3/i;->d(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lz3/c;->n:Lq3/n;

    .line 8
    .line 9
    iput-object p1, p0, Lz3/c;->o:LN3/X;

    .line 10
    .line 11
    :cond_0
    return-void
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
.end method
