.class public final Lco/notix/lsi/LsiInterval$Optimized;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/lsi/LsiInterval;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/lsi/LsiInterval;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Optimized"
.end annotation


# static fields
.field public static final INSTANCE:Lco/notix/lsi/LsiInterval$Optimized;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/lsi/LsiInterval$Optimized;

    invoke-direct {v0}, Lco/notix/lsi/LsiInterval$Optimized;-><init>()V

    sput-object v0, Lco/notix/lsi/LsiInterval$Optimized;->INSTANCE:Lco/notix/lsi/LsiInterval$Optimized;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
