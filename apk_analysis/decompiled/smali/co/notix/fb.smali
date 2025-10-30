.class public final enum Lco/notix/fb;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:Lco/notix/fb;

.field public static final synthetic e:[Lco/notix/fb;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/graphics/Bitmap$CompressFormat;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lco/notix/fb;

    .line 2
    .line 3
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 4
    .line 5
    const-string v1, "JPEG"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "jpg"

    .line 9
    .line 10
    const/16 v5, 0x55

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lco/notix/fb;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/graphics/Bitmap$CompressFormat;I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lco/notix/fb;

    .line 16
    .line 17
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v3, 0x1e

    .line 20
    .line 21
    if-lt v2, v3, :cond_0

    .line 22
    .line 23
    invoke-static {}, LP/x0;->g()Landroid/graphics/Bitmap$CompressFormat;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :goto_0
    move-object v5, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    if-lt v2, v3, :cond_1

    .line 33
    .line 34
    const/16 v2, 0x64

    .line 35
    .line 36
    :goto_2
    move v6, v2

    .line 37
    goto :goto_3

    .line 38
    :cond_1
    const/16 v2, 0x50

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :goto_3
    const/4 v3, 0x1

    .line 42
    const-string v4, "webp"

    .line 43
    .line 44
    const-string v2, "WEBP"

    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lco/notix/fb;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/graphics/Bitmap$CompressFormat;I)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lco/notix/fb;->d:Lco/notix/fb;

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    new-array v2, v2, [Lco/notix/fb;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    aput-object v0, v2, v3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    aput-object v1, v2, v0

    .line 59
    .line 60
    sput-object v2, Lco/notix/fb;->e:[Lco/notix/fb;

    .line 61
    .line 62
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Landroid/graphics/Bitmap$CompressFormat;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/notix/fb;->a:Ljava/lang/String;

    iput-object p4, p0, Lco/notix/fb;->b:Landroid/graphics/Bitmap$CompressFormat;

    iput p5, p0, Lco/notix/fb;->c:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/notix/fb;
    .locals 1

    const-class v0, Lco/notix/fb;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/notix/fb;

    return-object p0
.end method

.method public static values()[Lco/notix/fb;
    .locals 1

    sget-object v0, Lco/notix/fb;->e:[Lco/notix/fb;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/notix/fb;

    return-object v0
.end method
