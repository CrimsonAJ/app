.class public final LV7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV7/j;
.implements LV7/d;


# instance fields
.field public final a:LV7/j;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(LV7/j;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV7/o;->a:LV7/j;

    .line 5
    .line 6
    iput p2, p0, LV7/o;->b:I

    .line 7
    .line 8
    iput p3, p0, LV7/o;->c:I

    .line 9
    .line 10
    if-ltz p2, :cond_2

    .line 11
    .line 12
    if-ltz p3, :cond_1

    .line 13
    .line 14
    if-lt p3, p2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p1, "endIndex should be not less than startIndex, but was "

    .line 18
    .line 19
    const-string v0, " < "

    .line 20
    .line 21
    invoke-static {p1, p3, p2, v0}, LA0/a;->l(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p2

    .line 35
    :cond_1
    const-string p1, "endIndex should be non-negative, but is "

    .line 36
    .line 37
    invoke-static {p3, p1}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p2

    .line 51
    :cond_2
    const-string p1, "startIndex should be non-negative, but is "

    .line 52
    .line 53
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p2
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


# virtual methods
.method public final a(I)LV7/j;
    .locals 3

    .line 1
    iget v0, p0, LV7/o;->c:I

    .line 2
    .line 3
    iget v1, p0, LV7/o;->b:I

    .line 4
    .line 5
    sub-int v2, v0, v1

    .line 6
    .line 7
    if-lt p1, v2, :cond_0

    .line 8
    .line 9
    sget-object p1, LV7/e;->a:LV7/e;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v2, LV7/o;

    .line 13
    .line 14
    add-int/2addr v1, p1

    .line 15
    iget-object p1, p0, LV7/o;->a:LV7/j;

    .line 16
    .line 17
    invoke-direct {v2, p1, v1, v0}, LV7/o;-><init>(LV7/j;II)V

    .line 18
    .line 19
    .line 20
    return-object v2
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

.method public final b()LV7/j;
    .locals 4

    .line 1
    iget v0, p0, LV7/o;->c:I

    .line 2
    .line 3
    iget v1, p0, LV7/o;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/16 v2, 0xf

    .line 7
    .line 8
    if-lt v2, v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, LV7/o;

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0xf

    .line 14
    .line 15
    iget-object v3, p0, LV7/o;->a:LV7/j;

    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, LV7/o;-><init>(LV7/j;II)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LV7/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LV7/h;-><init>(LV7/o;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
