.class public final Lco/notix/banner/BannerSize$Inline;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/banner/BannerSize;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/banner/BannerSize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Inline"
.end annotation


# instance fields
.field private final maxHeight:I

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/notix/banner/BannerSize$Inline;->width:I

    iput p2, p0, Lco/notix/banner/BannerSize$Inline;->maxHeight:I

    return-void
.end method


# virtual methods
.method public final getMaxHeight()I
    .locals 1

    iget v0, p0, Lco/notix/banner/BannerSize$Inline;->maxHeight:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lco/notix/banner/BannerSize$Inline;->width:I

    return v0
.end method
