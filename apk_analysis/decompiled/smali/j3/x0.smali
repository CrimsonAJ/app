.class public final Lj3/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lj3/x0;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lj3/x0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, v1, v2}, Lj3/x0;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    new-instance v3, Lj3/x0;

    .line 9
    .line 10
    const-wide v4, 0x7fffffffffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {v3, v4, v5, v4, v5}, Lj3/x0;-><init>(JJ)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lj3/x0;

    .line 19
    .line 20
    invoke-direct {v3, v4, v5, v1, v2}, Lj3/x0;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lj3/x0;

    .line 24
    .line 25
    invoke-direct {v3, v1, v2, v4, v5}, Lj3/x0;-><init>(JJ)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lj3/x0;->c:Lj3/x0;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
.end method

.method public constructor <init>(JJ)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ltz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, Ll4/a;->h(Z)V

    .line 16
    .line 17
    .line 18
    cmp-long v0, p3, v0

    .line 19
    .line 20
    if-ltz v0, :cond_1

    .line 21
    .line 22
    move v3, v4

    .line 23
    :cond_1
    invoke-static {v3}, Ll4/a;->h(Z)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lj3/x0;->a:J

    .line 27
    .line 28
    iput-wide p3, p0, Lj3/x0;->b:J

    .line 29
    .line 30
    return-void
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
.method public final a(JJJ)J
    .locals 11

    .line 1
    iget-wide v0, p0, Lj3/x0;->a:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    iget-wide v5, p0, Lj3/x0;->b:J

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    cmp-long v4, v5, v2

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return-wide p1

    .line 16
    :cond_0
    sget v4, Ll4/y;->a:I

    .line 17
    .line 18
    sub-long v7, p1, v0

    .line 19
    .line 20
    xor-long/2addr v0, p1

    .line 21
    xor-long v9, p1, v7

    .line 22
    .line 23
    and-long/2addr v0, v9

    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-gez v0, :cond_1

    .line 27
    .line 28
    const-wide/high16 v7, -0x8000000000000000L

    .line 29
    .line 30
    :cond_1
    add-long v0, p1, v5

    .line 31
    .line 32
    xor-long v9, p1, v0

    .line 33
    .line 34
    xor-long/2addr v5, v0

    .line 35
    and-long/2addr v5, v9

    .line 36
    cmp-long v2, v5, v2

    .line 37
    .line 38
    if-gez v2, :cond_2

    .line 39
    .line 40
    const-wide v0, 0x7fffffffffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :cond_2
    cmp-long v2, v7, p3

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x1

    .line 49
    if-gtz v2, :cond_3

    .line 50
    .line 51
    cmp-long v2, p3, v0

    .line 52
    .line 53
    if-gtz v2, :cond_3

    .line 54
    .line 55
    move v2, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move v2, v3

    .line 58
    :goto_0
    cmp-long v5, v7, p5

    .line 59
    .line 60
    if-gtz v5, :cond_4

    .line 61
    .line 62
    cmp-long v0, p5, v0

    .line 63
    .line 64
    if-gtz v0, :cond_4

    .line 65
    .line 66
    move v3, v4

    .line 67
    :cond_4
    if-eqz v2, :cond_5

    .line 68
    .line 69
    if-eqz v3, :cond_5

    .line 70
    .line 71
    sub-long v0, p3, p1

    .line 72
    .line 73
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    sub-long p1, p5, p1

    .line 78
    .line 79
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide p1

    .line 83
    cmp-long p1, v0, p1

    .line 84
    .line 85
    if-gtz p1, :cond_7

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    if-eqz v2, :cond_6

    .line 89
    .line 90
    :goto_1
    return-wide p3

    .line 91
    :cond_6
    if-eqz v3, :cond_8

    .line 92
    .line 93
    :cond_7
    return-wide p5

    .line 94
    :cond_8
    return-wide v7
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lj3/x0;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lj3/x0;

    .line 18
    .line 19
    iget-wide v2, p0, Lj3/x0;->a:J

    .line 20
    .line 21
    iget-wide v4, p1, Lj3/x0;->a:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-wide v2, p0, Lj3/x0;->b:J

    .line 28
    .line 29
    iget-wide v4, p1, Lj3/x0;->b:J

    .line 30
    .line 31
    cmp-long p1, v2, v4

    .line 32
    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_2
    :goto_0
    return v1
    .line 37
    .line 38
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lj3/x0;->a:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    mul-int/lit8 v0, v0, 0x1f

    .line 5
    .line 6
    iget-wide v1, p0, Lj3/x0;->b:J

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
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
