.class public interface abstract Lco/notix/lsi/LsiInterval;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/lsi/LsiInterval$Optimized;,
        Lco/notix/lsi/LsiInterval$Fixed;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/nd;

.field public static final LSI_FALLBACK_INTERVAL:J = 0x36ee80L


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/nd;->a:Lco/notix/nd;

    sput-object v0, Lco/notix/lsi/LsiInterval;->Companion:Lco/notix/nd;

    return-void
.end method
